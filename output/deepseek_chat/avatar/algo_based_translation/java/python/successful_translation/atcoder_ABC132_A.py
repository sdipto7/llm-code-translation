
from collections import defaultdict

def main():
    s = input().strip()
    targ = list(s)
    map = defaultdict(int)
    for char in targ:
        map[char] += 1
    
    ok = True
    for count in map.values():
        if count != 2:
            ok = False
            break
            
    if ok and len(map) == 2:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()

