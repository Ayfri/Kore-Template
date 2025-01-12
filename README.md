# Kore Datapack Template for Minecraft

Welcome to the Kore Datapack Template project! This repository is designed to be a starting point for Minecraft enthusiasts and developers
looking to create custom datapacks with ease. By leveraging the power of the [Kore](https://kore.ayfri.com) library, you can streamline your
development workflow and bring your creative Minecraft ideas to life.

## Getting Started

Before you begin, ensure you have the following prerequisite installed on your system:

- Java Development Kit (JDK) version 21 or higher

## Setting Up Your Development Environment

To set up your development environment, follow these simple steps:

1. Clone the repository to your local machine:
    ```shell
    git clone https://github.com/Ayfri/Kore-Template.git
    ```
2. Change directory to the newly cloned repository:
    ```shell
    cd yourreponame
    ```
3. Execute the project to generate your datapack:
    ```shell
    ./gradlew run
    ```

After running the project, you'll find the generated datapack in the `out` directory, ready to be used in your Minecraft world.

## Making Changes to Your Datapack

When you're ready to make changes or updates to your datapack:

- Edit the `Main.kt` file with your desired changes, then rerun the project to apply them.
- If you need to update the Kore library or Kotlin version, adjust the `libs.versions.toml` file as needed, and rerun the project to ensure
  the changes take effect.

## Frequently Asked Questions (FAQ)

- **Q:** How do I add a new function to the datapack?
- **A:** Use the `function` keyword to create a new function and write your code within it.

- **Q:** How do I add a new tag to the datapack?
- **A:** Use the `tag` keyword to create a new tag and include your elements within it.

For detailed instructions and best practices on using the Kore library, refer to
the [official Kore documentation](https://kore.ayfri.com/docs/home).

## Contributing to the Project

Your contributions are what make the community great. We encourage you to contribute to the project by forking the repository, making your
improvements, and submitting a pull request with your changes. Together, we can make the Kore Datapack Template even better!

Thank you for supporting the project, and happy Datapacking!
