
class Main:
    @staticmethod
    def main():
        a = int(input())
        b = int(input())
        c = int(input())
        d = int(input())
        if a * b >= c * d:
            print(a * b)
        elif a * b <= c * d:
            print(c * d)

if __name__ == "__main__":
    Main.main()

