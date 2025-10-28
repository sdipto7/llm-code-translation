import sys

def main():
    import sys
    from collections import defaultdict
    
    s = sys.stdin.readline().strip()
    t = sys.stdin.readline().strip()
    ura = 0
    opa = 0
    tmap = defaultdict(int)
    
    for ch in t:
        tmap[ch] += 1
    
    length = len(s)
    s_list = list(s)
    
    for i in range(length):
        ch = s_list[i]
        if tmap[ch] > 0:
            tmap[ch] -= 1
            if tmap[ch] == 0:
                del tmap[ch]
            s_list[i] = 'Я'
            ura += 1
    
    for i in range(length):
        ch = s_list[i]
        rch = reverse(ch)
        if tmap[rch] > 0:
            tmap[rch] -= 1
            if tmap[rch] == 0:
                del tmap[rch]
            opa += 1
    
    print(ura, opa)

def reverse(ch):
    if ch.islower():
        return ch.upper()
    else:
        return ch.lower()

if __name__ == "__main__":
    main()
