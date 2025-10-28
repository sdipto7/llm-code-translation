
def atcoder_ABC170_A():
    import sys
    input = sys.stdin.read
    data = input().strip().split(" ")
    result = 0
    for str_value in data:
        result += 1
        if str_value == "0":
            break
    print(result)

if __name__ == "__main__":
    atcoder_ABC170_A()

