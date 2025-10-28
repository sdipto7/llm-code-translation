
import sys

def main():
    n = int(sys.stdin.readline())
    input_str = sys.stdin.readline().strip()
    max_len = -1
    msg_lengths = []
    count = 0
    idx = 0

    for i in range(len(input_str)):
        c = input_str[i]
        if c in {'.', '?', '!'}:
            msg_lengths.append(count + 1)
            if count + 1 > max_len:
                max_len = count + 1
            i += 1
            count = 0
        else:
            count += 1

    if max_len > n:
        print("Impossible")
    else:
        ans = 0
        i = 0
        while i < len(msg_lengths):
            l = msg_lengths[i]
            while i < len(msg_lengths) - 1 and l + msg_lengths[i + 1] + 1 <= n:
                l += msg_lengths[i + 1] + 1
                i += 1
            ans += 1
            i += 1
        print(ans)

if __name__ == "__main__":
    main()

