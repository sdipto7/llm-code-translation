
class Main:
    BASE = 3

    @staticmethod
    def main():
        n = int(input())
        cube = pow(n, Main.BASE)
        print(int(cube))

if __name__ == "__main__":
    Main.main()

