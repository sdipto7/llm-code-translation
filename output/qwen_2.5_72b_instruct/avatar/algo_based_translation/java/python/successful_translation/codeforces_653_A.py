
import sys
from collections import Counter

class Codeforces653A:
    @staticmethod
    def main():
        import sys
        input = sys.stdin.read().split()
        n = int(input[0])
        a = list(map(int, input[1:n+1]))
        a = sorted(set(a))
        found = False
        for i in range(len(a) - 2):
            if a[i] + 1 == a[i + 1] and a[i + 1] + 1 == a[i + 2]:
                found = True
                break
        print("YES" if found else "NO")

if __name__ == "__main__":
    Codeforces653A.main()

