
class Main:
    @staticmethod
    def log_str(s):
        print(s)

    @staticmethod
    def log_int(n):
        print(n)

    @staticmethod
    def main():
        A = int(input())
        B = int(input())
        T = int(input())
        result = (T // A) * B
        Main.log_int(result)

if __name__ == "__main__":
    Main.main()

