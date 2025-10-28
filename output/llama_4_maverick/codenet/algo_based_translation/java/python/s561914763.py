
class Main:
    ODD = {"R", "U", "D"}
    EVE = {"L", "U", "D"}

    @staticmethod
    def is_match(set, c):
        return str(c) in set

    @staticmethod
    def main():
        N = input().strip()
        tap = list(N)
        is_good = True
        for i in range(len(N)):
            if (i + 1) % 2 == 0:
                is_good = Main.is_match(Main.EVE, tap[i])
            else:
                is_good = Main.is_match(Main.ODD, tap[i])
            if not is_good:
                break
        print("Yes" if is_good else "No")

if __name__ == "__main__":
    Main.main()

