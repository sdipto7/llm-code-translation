
class Main:
    @staticmethod
    def rotate(s):
        len_s = len(s)
        t = s[0]
        s = list(s)
        for i in range(len_s - 1):
            s[i] = s[i + 1]
        s[len_s - 1] = t
        return ''.join(s)

    @staticmethod
    def main():
        s = input().strip()
        t = input().strip()
        flag = False
        for _ in range(len(s)):
            s = Main.rotate(s)
            if t == s:
                flag = True
                break
        if flag:
            print("Yes")
        else:
            print("No")

if __name__ == "__main__":
    Main.main()

