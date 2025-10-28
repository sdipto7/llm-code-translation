
from collections import defaultdict

def main():
    N = int(input())
    words = [input() for _ in range(N)]
    ans = True
    seen = set()
    for i in range(N):
        if words[i] in seen:
            ans = False
            break
        seen.add(words[i])
        if i != 0:
            if words[i][0] != words[i-1][-1]:
                ans = False
                break
    if ans:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()

