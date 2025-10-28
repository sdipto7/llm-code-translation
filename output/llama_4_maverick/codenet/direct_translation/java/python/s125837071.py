
def find_s(k, i):
    s = 0
    while k % i == 0:
        k //= i
        s += 1
    return s

def main():
    n = int(input())
    ans = 1
    mod = 10**9 + 7
    for i in range(2, n + 1):
        j = 2
        is_prime = True
        while j * j <= i:
            if i % j == 0:
                is_prime = False
                break
            j += 1
        if is_prime:
            s = sum(find_s(k, i) for k in range(1, n + 1))
            ans = (ans * (s + 1)) % mod
    print(ans)

if __name__ == "__main__":
    main()

