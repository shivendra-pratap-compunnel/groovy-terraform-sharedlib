void call() {
    echo 'Running stage 2 '
    // Execute the command using sh
    sh 'terraform init -no-color'
}
