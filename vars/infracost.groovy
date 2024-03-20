
void call() {
    echo "Running Infracost...."
    sh '''
        Infracost breakdown --path .
    '''
    echo "Finised infracost run."
}
