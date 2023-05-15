import React from 'react';
import PropTypes from 'prop-types';
import styles from './About.scss';

const About = props => (
	<div>This is a component called About.</div>
);

// todo: Unless you need to use lifecycle methods or local state,
// write your component in functional form as above and delete
// this section. 
// class About extends React.Component {
//   render() {
//     return <div>This is a component called About.</div>;
//   }
// }

const AboutPropTypes = {
	// always use prop types!
};

About.propTypes = AboutPropTypes;

export default About;
