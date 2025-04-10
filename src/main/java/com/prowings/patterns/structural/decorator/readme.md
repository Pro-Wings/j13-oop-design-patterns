🎯 Real-World Analogy: Coffee Customization ☕
Imagine you walk into a coffee shop:

You order a basic Espresso.

Then, you want to add Milk.

Then, you decide to add Sugar.

Each "add-on" wraps your base drink and enhances it.

🎉 You didn’t change how Espresso is made — you just decorated it with milk and sugar!


        ┌────────────┐
        │  Beverage  │◄── Interface (Component)
        └────┬───────┘
             │
    ┌────────▼────────┐
    │  Espresso       │  ◄── Concrete Component
    └─────────────────┘
             ▲
     Decorators (Milk, Sugar, etc.)
┌────────────┴────────────┐
│      AddOnsDecorator    │  ◄── Abstract Decorator
├─────────────────────────┤
│    MilkDecorator, etc.  │  ◄── Concrete Decorators
└─────────────────────────┘
