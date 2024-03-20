void terraform.init() {
        echo 'Generating provider.tf...'
        sh '''
            terraform init -no-color
        '''
}
