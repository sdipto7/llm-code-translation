import sys

def main():
    import sys
    import io
    input = sys.stdin.read
    data = input().splitlines()
    n = int(data[0])
    input_string = data[1]
    max_length = -1
    msg_length = [0] * (len(input_string) // 2)
    count = 0
    idx = 0
    for i in range(len(input_string)):
        c = input_string[i]
        if c == '.' or c == '?' or c == '!':
            msg_length[idx] = count + 1
            idx += 1
            max_length = max(max_length, count + 1)
            i += 1
            count = 0
        else:
            count += 1
    if max_length > n:
        print("Impossible")
    else:
        ans = 0
        i = 0
        while i < idx:
            l = msg_length[i]
            while i < idx - 1 and l + msg_length[i + 1] + 1 <= n:
                l += msg_length[i + 1] + 1
                i += 1
            ans += 1
            i += 1
        print(ans)

if __name__ == "__main__":
    main()
