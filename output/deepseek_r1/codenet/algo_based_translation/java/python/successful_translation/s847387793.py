
n, m, q = map(int, input().split())
queries = [tuple(map(int, input().split())) for _ in range(q)]
max_score = 0

def dfs(current):
    global max_score
    if len(current) > n:
        score = 0
        for a_i, b_i, c_i, d_i in queries:
            if current[b_i] - current[a_i] == c_i:
                score += d_i
        if score > max_score:
            max_score = score
        return
    new_arr = current.copy()
    new_arr.append(new_arr[-1])
    while new_arr[-1] <= m:
        dfs(new_arr)
        new_arr = new_arr[:-1] + [new_arr[-1] + 1]

dfs([1])
print(max_score)

