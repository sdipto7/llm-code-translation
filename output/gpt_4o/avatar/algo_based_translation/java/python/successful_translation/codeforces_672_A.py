
def generate_string():
    sb = []
    for i in range(1, 1001):
        sb.append(str(i))
    return ''.join(sb)

def main():
    import sys
    input = sys.stdin.read
    n = int(input().strip())
    result_string = generate_string()
    print(result_string[n - 1])

if __name__ == "__main__":
    main()

