
h, w = map(int, input().split())
ans = ['#' + input() + '#' for _ in range(h)]
print('#' * (w + 2))
for s in ans:
    print(s)
print('#' * (w + 2))

