
def is_match(char_set, c):
    return c in char_set

def main():
    ODD = {'R', 'U', 'D'}
    EVE = {'L', 'U', 'D'}
    
    N = input().strip()
    tap = list(N)
    
    is_good = True
    for i in range(len(N)):
        if (i + 1) % 2 == 0:  # even index in 1-based index
            if not is_match(EVE, tap[i]):
                is_good = False
                break
        else:  # odd index in 1-based index
            if not is_match(ODD, tap[i]):
                is_good = False
                break
    
    print("Yes" if is_good else "No")

if __name__ == "__main__":
    main()

