
def generate_string():
    s = ''
    for i in range(1, 1001):
        s += str(i)
    return list(s)

def main():
    n = int(input())
    char_array = generate_string()
    print(char_array[n - 1])

if __name__ == "__main__":
    main()

