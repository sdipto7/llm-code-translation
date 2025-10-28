
import sys
from collections import defaultdict

def main():
    import sys
    import sys
    input = sys.stdin.read().split()
    N = int(input[0])
    map = {}
    index = 1
    for i in range(N):
        map[i] = input[index]
        index += 1
    ans = True
    past = defaultdict(bool)
    next = ""
    for i in range(N):
        if past[map[i]]:
            ans = False
            break
        past[map[i]] = True
        if i != 0:
            if next != map[i][0]:
                ans = False
                break
        next = map[i][-1]
    if ans:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()

