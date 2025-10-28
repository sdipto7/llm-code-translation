
import sys

def main():
    s = input().strip()
    k = int(input().strip())
    sb = []
    
    for i in range(len(s)):
        calc_val = 26 - (ord(s[i]) - ord('a'))
        if calc_val <= k and s[i] != 'a':
            k -= calc_val
            sb.append('a')
        else:
            sb.append(s[i])
    
    if k > 0:
        t = sb[-1]
        sb.pop()
        new_char = chr(ord('a') + (ord(t) - ord('a') + k) % 26)
        sb.append(new_char)
    
    print(''.join(sb))

if __name__ == "__main__":
    main()

