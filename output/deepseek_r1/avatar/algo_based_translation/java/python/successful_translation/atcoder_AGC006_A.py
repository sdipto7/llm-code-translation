
N = 210

def get_fail(b, m):
    f = [0] * N
    j = 0
    f[0] = f[1] = 0
    for i in range(2, m + 1):
        while j > 0 and b[j + 1] != b[i]:
            j = f[j]
        if b[j + 1] == b[i]:
            j += 1
        f[i] = j
    return f

def main():
    n = int(input())
    s1 = input().strip()
    str_ = input().strip()
    
    b = [''] * N
    cnt = 0
    for c in str_:
        cnt += 1
        b[cnt] = c
    for c in s1:
        cnt += 1
        b[cnt] = c
    
    f = get_fail(b, cnt)
    max_len = f[cnt]
    overlap = min(max_len, n)
    print(2 * n - overlap)

if __name__ == "__main__":
    main()

