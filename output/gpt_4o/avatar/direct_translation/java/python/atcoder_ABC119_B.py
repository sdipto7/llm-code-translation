
def solve(x, u):
    return sum(x[i] * (1 if u[i] == "JPY" else 380000) for i in range(len(x)))

def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    N = int(data[0])
    x = [float(data[i * 2 + 1]) for i in range(N)]
    u = [data[i * 2 + 2] for i in range(N)]
    
    result = solve(x, u)
    print(result)

if __name__ == "__main__":
    main()

