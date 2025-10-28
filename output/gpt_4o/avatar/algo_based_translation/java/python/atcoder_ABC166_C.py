
def atcoder_ABC166_C():
    import sys
    input = sys.stdin.read
    data = input().split()

    index = 0
    
    N = int(data[index])
    index += 1
    M = int(data[index])
    index += 1

    H = [0] * N
    ans = [True] * N

    for i in range(N):
        H[i] = int(data[index])
        index += 1

    for _ in range(M):
        temp1 = int(data[index])
        index += 1
        temp2 = int(data[index])
        index += 1

        if H[temp1 - 1] < H[temp2 - 1]:
            ans[temp1 - 1] = False
        elif H[temp1 - 1] > H[temp2 - 1]:
            ans[temp2 - 1] = False
        else:
            ans[temp1 - 1] = False
            ans[temp2 - 1] = False

    ans2 = 0
    for i in range(N):
        if ans[i]:
            ans2 += 1

    print(ans2)

# Call the function if necessary
# atcoder_ABC166_C()

