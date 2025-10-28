
class Main:
    @staticmethod
    def main():
        A = int(input())
        B = int(input())
        T = int(input())
        Main.log((T // A) * B)

    @staticmethod
    def log(value):
        print(value)

if __name__ == "__main__":
    Main.main()

