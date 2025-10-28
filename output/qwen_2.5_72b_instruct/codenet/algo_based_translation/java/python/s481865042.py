
import sys

def main():
    import sys
    import string
    
    s = input().strip()
    k = int(input().strip())
    sb = []
    
    for i in range(len(s)):
        if (26 - (ord(s[i]) - ord('a'))) <= k and s[i] != 'a':
            k -= (26 - (ord(s[i]) - ord('a')))
            sb.append('a')
        else:
            sb.append(s[i])
    
    if k > 0:
        t = sb[-1]
        sb.pop()
        sb.append(chr((ord(t) - ord('a') + k) % 26 + ord('a')))
    
    print(''.join(sb))

if __name__ == "__main__":
    main()

