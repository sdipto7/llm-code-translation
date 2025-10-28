
class Main:
    @staticmethod
    def solve():
        a = input().strip()
        if len(a) != 3:
            raise ValueError("Input must be a 3-character string")
        if (a[0] == a[1]) or (a[1] == a[2]) or (a[2] == a[0]):
            print("No")
        else:
            print("Yes")

    @staticmethod
    def main():
        Main.solve()

if __name__ == "__main__":
    Main.main()

