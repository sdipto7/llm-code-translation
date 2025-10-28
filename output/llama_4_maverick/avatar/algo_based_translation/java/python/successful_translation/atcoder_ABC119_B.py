
def main():
    N = int(input())
    x = [0] * N
    u = [0] * N
    for i in range(N):
        x[i], u[i] = input().split()
        x[i] = float(x[i])
    total_sum = sum(x[i] * (380000 if u[i] == "BTC" else 1) for i in range(N))
    print(total_sum)

if __name__ == "__main__":
    main()

