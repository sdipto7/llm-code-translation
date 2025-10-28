
class Main:
    @staticmethod
    def is_even_string(s):
        a = s[:len(s)//2]
        b = s[len(s)//2:]
        return a == b

    @staticmethod
    def main():
        S = input().strip()
        if len(S) % 2 == 1:
            S = S[:-1]
        else:
            S = S[:-2]
        while len(S) > 0:
            if Main.is_even_string(S):
                break
            S = S[:-2]
        print(len(S))

if __name__ == "__main__":
    Main.main()

