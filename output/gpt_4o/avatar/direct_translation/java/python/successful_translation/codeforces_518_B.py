
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    s = list(data[0])
    t = data[1]
    
    ura = 0
    opa = 0
    tmap = {}
    
    for ch in t:
        if ch not in tmap:
            tmap[ch] = 1
        else:
            tmap[ch] += 1

    length = len(s)
    
    for i in range(length):
        ch = s[i]
        num = tmap.get(ch)
        if num is None:
            continue
        if num == 1:
            del tmap[ch]
        else:
            tmap[ch] -= 1
        s[i] = 'Я'
        ura += 1
    
    for i in range(length):
        ch = s[i]
        rch = reverse(ch)
        num = tmap.get(rch)
        if num is None:
            continue
        if num == 1:
            del tmap[rch]
        else:
            tmap[rch] -= 1
        opa += 1
    
    print(ura, opa)

def reverse(ch):
    if ch.islower():
        return ch.upper()
    else:
        return ch.lower()

if __name__ == "__main__":
    main()

