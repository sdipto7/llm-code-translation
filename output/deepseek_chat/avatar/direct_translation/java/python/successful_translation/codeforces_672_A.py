
def generate_string():
    s = ''
    for i in range(1, 1001):
        s += str(i)
    return list(s)

n = int(input())
print(generate_string()[n - 1])

