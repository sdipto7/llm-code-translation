
def solve(x, u):
    return sum(x[i] * (1 if u[i] == "JPY" else 380000) for i in range(len(x)))

def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    N = int(data[0])
    x = []
    u = []
    
    index = 1
    for i in range(N):
        x.append(float(data[index]))
        u.append(data[index + 1])
        index += 2
        
    result = solve(x, u)
    print(result)

if __name__ == "__main__":
    main()

