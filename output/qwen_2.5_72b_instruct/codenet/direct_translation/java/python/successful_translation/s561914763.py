import sys

ODD = {"R", "U", "D"}
EVE = {"L", "U", "D"}

def is_match(s, c):
    return c in s

def main():
    N = input().strip()
    is_good = True
    for i, c in enumerate(N):
        if (i + 1) % 2 == 0:
            if not is_match(EVE, c):
                is_good = False
                break
        else:
            if not is_match(ODD, c):
                is_good = False
                break

    print("Yes" if is_good else "No")

if __name__ == "__main__":
    main()
