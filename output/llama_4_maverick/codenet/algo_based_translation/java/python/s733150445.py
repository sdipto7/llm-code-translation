from decimal import Decimal

def main():
    try:
        user_input = input().split()
        a = Decimal(user_input[0])
        b = Decimal(user_input[1])
        mul = a * b
        result = str(mul).split('.')[0]
        print(result)
    except Exception as e:
        # In a real application, you would log this error
        pass

if __name__ == "__main__":
    main()
