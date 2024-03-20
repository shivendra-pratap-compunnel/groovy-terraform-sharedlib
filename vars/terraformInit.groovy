void call() {
    echo 'Generating provider.tf...'
    // Define the command to execute
    def command = "terraform init -no-color"
    
    // Execute the command
    def proc = command.execute()
    
    // Wait for the command to finish and capture the output
    proc.waitForProcessOutput(System.out, System.err)
}
