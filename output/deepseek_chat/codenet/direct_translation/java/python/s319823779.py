from sys import stdin

def main():
    a = int(stdin.readline())
    b = int(stdin.readline())
    c = int(stdin.readline())
    x = int(stdin.readline())
    
    res = 0
    
    for i in range(a + 1):
        for j in range(b + 1):
            for k in range(c + 1):
                total = 500 * i + 100 * j + 50 * k
                if total == x:
                    res += 1
    print(res)

if __name__ == "__main__":
    main()
