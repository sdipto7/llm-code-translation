
def generate_string():
    s = []
    for i in range(1, 1001):
        s.append(str(i))
    return ''.join(s)

if __name__ == "__main__":
    n = int(input())
    print(generate_string()[n-1])

