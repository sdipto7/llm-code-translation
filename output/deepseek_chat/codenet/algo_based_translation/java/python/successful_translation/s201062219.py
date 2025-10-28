
def main():
    import sys
    data = sys.stdin.read().split()
    index = 0
    mark = ""
    c = 0
    b = 0
    x = 0
    a = [0] * 100000
    
    while True:
        c = int(data[index]); index += 1
        mark = data[index]; index += 1
        b = int(data[index]); index += 1
        
        if mark == "?":
            a[x] = 2000001
            break
        elif mark == "+":
            a[x] = c + b
        elif mark == "-":
            a[x] = c - b
        elif mark == "*":
            a[x] = c * b
        elif mark == "/":
            a[x] = c // b
        
        x += 1
    
    x = 0
    while True:
        if a[x] == 2000001:
            break
        print(a[x])
        x += 1

if __name__ == "__main__":
    main()

