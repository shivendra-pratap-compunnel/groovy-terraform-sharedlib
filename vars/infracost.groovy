
void call() {
    echo "Running Infracost...."
    sh '''
        /usr/local/bin/infracost breakdown --path .
    '''
    echo "Finised infracost run."
}
