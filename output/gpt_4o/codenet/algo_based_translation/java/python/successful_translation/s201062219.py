
def main():
    import sys
    
    a = [0] * 100000
    x = 0
    
    for line in sys.stdin:
        inputs = line.strip().split()
        c = int(inputs[0])
        mark = inputs[1]
        b = int(inputs[2])
        
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

