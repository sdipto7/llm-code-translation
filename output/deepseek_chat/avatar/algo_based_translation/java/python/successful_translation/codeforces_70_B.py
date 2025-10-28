
import sys

def main():
    data = sys.stdin.read().splitlines()
    n = int(data[0])
    input_str = data[1]
    max_val = -1
    msgLength = [0] * (len(input_str) // 2)
    count = 0
    idx = 0
    i = 0
    while i < len(input_str):
        c = input_str[i]
        if c in ['.', '?', '!']:
            count += 1
            msgLength[idx] = count
            idx += 1
            if count > max_val:
                max_val = count
            i += 1
            count = 0
        else:
            count += 1
        i += 1
    
    if max_val > n:
        print("Impossible")
    else:
        ans = 0
        i = 0
        while i < idx:
            l = msgLength[i]
            while i < idx - 1 and l + msgLength[i + 1] + 1 <= n:
                l += msgLength[i + 1] + 1
                i += 1
            ans += 1
            i += 1
        print(ans)

if __name__ == "__main__":
    main()

