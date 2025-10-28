
class Main:
    buf = None

    @staticmethod
    def main():
        try:
            Main.buf = sys.stdin.readline().strip()
            inp = Main.buf.split(" ")
            abc = [int(x) for x in inp]
            if abc[0] < abc[1] and abc[1] < abc[2]:
                print("Yes")
            else:
                print("No")
        except Exception as e:
            pass

if __name__ == "__main__":
    import sys
    Main.main()

