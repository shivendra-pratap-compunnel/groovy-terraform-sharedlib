
void call() {
    echo "Running Infracost...."
    sh '''
        /usr/local/bin/Infracost breakdown --path .
    '''
    echo "Finised infracost run."
}
