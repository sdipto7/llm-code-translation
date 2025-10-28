
def calculate_result(k: int, a: int, b: int) -> int:
    if b <= a + 2:
        return 1 + k
    x = k - (a - 1)
    ans = a + (x // 2) * (b - a) + (x % 2)
    return ans

if __name__ == "__main__":
    k = int(input())
    a = int(input())
    b = int(input())
    
    result = calculate_result(k, a, b)
    print(result)

