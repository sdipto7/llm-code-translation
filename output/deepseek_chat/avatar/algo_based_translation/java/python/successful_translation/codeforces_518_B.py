
import sys
from collections import defaultdict

def reverse_char(ch):
    if ch.islower():
        return ch.upper()
    else:
        return ch.lower()

def main():
    s = list(input().strip())
    t = input().strip()
    ura = 0
    opa = 0
    
    tmap = defaultdict(int)
    for char in t:
        tmap[char] += 1
    
    length = len(s)
    
    for i in range(length):
        ch = s[i]
        if ch not in tmap:
            continue
        count = tmap[ch]
        if count == 1:
            del tmap[ch]
        else:
            tmap[ch] = count - 1
        s[i] = 'Я'
        ura += 1
    
    for i in range(length):
        if s[i] == 'Я':
            continue
        ch = s[i]
        rch = reverse_char(ch)
        if rch not in tmap:
            continue
        count = tmap[rch]
        if count == 1:
            del tmap[rch]
        else:
            tmap[rch] = count - 1
        opa += 1
    
    print(f"{ura} {opa}")

if __name__ == "__main__":
    main()

