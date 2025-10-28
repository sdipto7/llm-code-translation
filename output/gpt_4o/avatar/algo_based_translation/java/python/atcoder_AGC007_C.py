
from decimal import Decimal, getcontext
import sys

def main():
    # Set precision for Decimal operations
    getcontext().prec = 40
    
    # Read inputs
    input_data = sys.stdin.read().strip().split()
    N = float(input_data[0])
    d = float(input_data[1])
    x = float(input_data[2])
    
    # Initialize result as a Decimal
    ans = Decimal("0.0")
    
    # Loop until the condition is met
    while N > 0.5:
        # Calculate adnum and add to ans
        adnum = Decimal(d + x * (N - 0.5))
        ans += adnum
        
        # Update d and x
        d = (N + 1.0) * d / N + (5.0 * x) / (2.0 * N)
        x = (1.0 + (2.0 / N)) * x
        
        # Decrement N
        N -= 1
    
    # Print formatted result with 20 decimal places
    print(f"{ans:.20f}")

if __name__ == "__main__":
    main()

