
class Main:
    def __init__(self):
        pass

    @staticmethod
    def main():
        C = input().strip()
        print(chr(ord(C[0]) + 1))

if __name__ == "__main__":
    Main.main()

