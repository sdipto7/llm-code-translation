
ODD = {"R", "U", "D"}
EVE = {"L", "U", "D"}

def is_match(charset, c):
    return c in charset

def main():
    N = input().strip()
    tap = list(N)
    is_good = True
    
    for i in range(len(N)):
        if (i + 1) % 2 == 0:
            if not is_match(EVE, tap[i]):
                is_good = False
                break
        else:
            if not is_match(ODD, tap[i]):
                is_good = False
                break
    
    print("Yes" if is_good else "No")

if __name__ == "__main__":
    main()

