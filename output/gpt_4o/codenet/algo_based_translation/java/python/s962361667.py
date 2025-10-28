
def main():
    import sys
    
    w = int(sys.stdin.readline().strip())
    n = int(sys.stdin.readline().strip())
    
    values = [i + 1 for i in range(w)]
    
    for _ in range(n):
        x = 0
        str_input = sys.stdin.readline().strip()
        ab = str_input.split(',')
        a = int(ab[0]) - 1
        b = int(ab[1]) - 1
        
        x = values[a]
        values[a] = values[b]
        values[b] = x
    
    for i in range(w):
        print(values[i])

if __name__ == "__main__":
    main()

