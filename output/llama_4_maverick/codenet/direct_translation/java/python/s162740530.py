
def main():
    MOD = 1000000007
    n, m = map(int, input().split())
    a = [0] + list(map(int, input().split())) if m > 0 else [0]
    cnt = [0] * (n + 1)
    cnt[0] = 1
    num = 1
