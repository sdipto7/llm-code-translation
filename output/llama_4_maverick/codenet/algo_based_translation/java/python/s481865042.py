
class Main:
    def main():
        s = input().split()[0]
        k = int(input().split()[0])
        sb = ''
        for i in range(len(s)):
            if (26 - (ord(s[i]) - ord('a'))) <= k and s[i] != 'a':
                k -= 26 - (ord(s[i]) - ord('a'))
                sb += 'a'
            else:
                sb += s[i]
        if k > 0:
            t = sb[-1]
            sb = sb[:-1]
            sb += chr((ord(t) - ord('a') + k) % 26 + ord('a'))
        print(sb)

if __name__ == "__main__":
    Main.main()

